import dao.user_dao
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
    with pytest.raises(UserNotFoundError):
        actual = user_service.get_user_by_id("1000")
