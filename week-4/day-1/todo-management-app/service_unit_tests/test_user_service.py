import dao.user_dao
from exception.invalid_parameter import InvalidParameterError
from exception.user_already_exists import UserAlreadyExistsError
from exception.user_not_found import UserNotFoundError
from model.user import User
from service.user_service import UserService
import pytest


def test_get_all_users(mocker):
    # Arrange
    # Mock method for the UserDao class
    def mock_get_all_users(self):
        return [User(1, 'test123', '000-000-0001', True), User(2, 'testing123', '000-000-0002', False)]

    mocker.patch('dao.user_dao.UserDao.get_all_users', mock_get_all_users)

    user_service = UserService()

    # Act
    actual = user_service.get_all_users()

    # Assert
    assert actual == [
        {
            "id": 1,
            "username": "test123",
            "mobile_phone": "000-000-0001",
            "active": True
        },
        {
            "id": 2,
            "username": "testing123",
            "mobile_phone": "000-000-0002",
            "active": False
        }
    ]


def test_get_user_by_id_positive(mocker):

    # Arrange
    def mock_get_user_by_id(self, user_id):
        if user_id == "1":
            return User(1, 'testing12345', '000-000-0001', True)
        else:
            return None

    # Mocking the real get_user_by_id in the dao layer with the fake one defined above
    mocker.patch('dao.user_dao.UserDao.get_user_by_id', mock_get_user_by_id)

    user_service = UserService()

    # Act
    actual = user_service.get_user_by_id("1")

    # Assert
    assert actual == {
        "id": 1,
        "username": "testing12345",
        "mobile_phone": "000-000-0001",
        "active": True
    }


# We want to make sure that the UserService get_user_by_id method will raise the UserNotFoundError
# If a user is not retrieved from the DAO
def test_get_user_by_id_negative(mocker):
    # Arrange
    def mock_get_user_by_id(self, user_id):
        if user_id == "1":
            return User(1, 'testing12345', '000-000-0001', True)
        else:
            return None

    mocker.patch('dao.user_dao.UserDao.get_user_by_id', mock_get_user_by_id)

    user_service = UserService()

    # Act

    # Method 1 of testing for exceptions occurring
    # try:
    #     actual = user_service.get_user_by_id("1000")
    #
    #     assert False  # Fail the test if we make it to this line of code. We should never reach this line if an exception
    #     # is actually raised
    # except UserNotFoundError as e:
    #     assert True

    # Method 2
    with pytest.raises(UserNotFoundError) as excinfo:
        actual = user_service.get_user_by_id("1000")

    # Testing for an exception message
    assert str(excinfo.value) == "User with id 1000 was not found"


def test_delete_user_by_id_positive(mocker):
    # AAA
    # Arrange
    def mock_delete_user_by_id(self, user_id):
        if user_id == "1":
            return True
        else:
            return False

    mocker.patch("dao.user_dao.UserDao.delete_user_by_id", mock_delete_user_by_id)

    user_service = UserService()

    # Act
    actual = user_service.delete_user_by_id("1")

    # Assert
    assert actual is None


def test_delete_user_by_id_negative(mocker):
    # AAA
    # Arrange
    def mock_delete_user_by_id(self, user_id):
        if user_id == "1":
            return True
        else:
            return False

    mocker.patch("dao.user_dao.UserDao.delete_user_by_id", mock_delete_user_by_id)

    user_service = UserService()

    # Act and Assert
    with pytest.raises(UserNotFoundError) as excinfo:
        user_service.delete_user_by_id("205")

    # Asserting for an exception message
    assert str(excinfo.value) == "User with id 205 was not found"

def test_add_user_positive(mocker):
    # Arrange
    # DAO should return None for a positive situation since a user shouldn't exist with that username already
    def mock_get_user_by_username(self, username):
        if username == "bachy21":
            return None

    mocker.patch("dao.user_dao.UserDao.get_user_by_username", mock_get_user_by_username)

    user_obj_to_add = User(None, "bachy21", "512-826-0001", None)

    def mock_add_user(self, user_obj):
        if user_obj == user_obj_to_add:
            return User(1, "bachy21", "512-826-0001", True)
        else:
            return None

    mocker.patch("dao.user_dao.UserDao.add_user", mock_add_user)

    user_service = UserService()

    # Act

    actual = user_service.add_user(user_obj_to_add)

    # Assert
    assert actual == {
        "id": 1,
        "username": "bachy21",
        "mobile_phone": "512-826-0001",
        "active": True
    }


def test_add_user_negative_spaces_in_username(mocker):
    # Arrange
    # DAO should return None for a positive situation since a user shouldn't exist with that username already
    user_obj_to_add = User(None, "   bachy   21  ", "512-826-0001", None)

    user_service = UserService()

    # Act and Assert

    with pytest.raises(InvalidParameterError) as excinfo:
        actual = user_service.add_user(user_obj_to_add)

    assert str(excinfo.value) == "Username cannot contain spaces"

def test_add_user_negative_length_is_less_than_6_for_username(mocker):
    # Arrange
    # DAO should return None for a positive situation since a user shouldn't exist with that username already
    user_obj_to_add = User(None, "bach1", "512-826-0001", None)

    user_service = UserService()

    # Act and Assert

    with pytest.raises(InvalidParameterError) as excinfo:
        actual = user_service.add_user(user_obj_to_add)

    assert str(excinfo.value) == "Username must be at least 6 characters"

def test_add_user_negative_username_already_exists(mocker):
    # Arrange
    user_object_to_add = User(None, "bachy21", "512-826-0001", None)

    def mock_get_user_by_username(self, username):
        if username == "bachy21":
            return User(1, "bachy21", "512-826-0001", True)

    mocker.patch("dao.user_dao.UserDao.get_user_by_username", mock_get_user_by_username)

    user_service = UserService()

    # Act + Assert
    with pytest.raises(UserAlreadyExistsError) as excinfo:
        actual = user_service.add_user(user_object_to_add)

    assert str(excinfo.value) == "User with username bachy21 already exists"

def test_update_user_by_id_positive(mocker):
    # Arrange
    update_user_obj = User(10, "john_doe", "512-826-1111", True)

    def mock_update_user_by_id(self, user_obj):
        if user_obj.id == 10:
            return User(10, "john_doe", "512-826-1111", True)
        else:
            return None

    mocker.patch("dao.user_dao.UserDao.update_user_by_id", mock_update_user_by_id)

    user_service = UserService()

    # Act
    actual = user_service.update_user_by_id(update_user_obj)

    # Assert
    assert actual == {
        "id": 10,
        "username": "john_doe",
        "mobile_phone": "512-826-1111",
        "active": True
    }

def test_update_user_by_id_positive(mocker):
    # Arrange
    update_user_obj = User(100, "john_doe", "512-826-1111", True)

    def mock_update_user_by_id(self, user_obj):
        if user_obj.id == 10:
            return User(10, "john_doe", "512-826-1111", True)
        else:
            return None

    mocker.patch("dao.user_dao.UserDao.update_user_by_id", mock_update_user_by_id)

    user_service = UserService()

    # Act + Assert
    with pytest.raises(UserNotFoundError) as excinfo:
        actual = user_service.update_user_by_id(update_user_obj)

    assert str(excinfo.value) == "User with id 100 was not found"
