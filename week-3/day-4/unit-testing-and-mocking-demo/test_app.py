from app import a, c

# A unit test case will fail if any exception occurs that is not handled
# Otherwise, it will pass
# Example of a unit test where we are mocking a function
def test_a(mocker):
    # What is the SUT (System under test)?
    # Answer: function a()

    # AAA
    # Arrange: set up whatever is necessary for the system under test
    # arrange is not necessary in this case

    # Here we are setting up a mock for function b() and telling it what to return instead of actually executing
    # the real function b
    mocker.patch('app.b', return_value=-1)

    # Act: invoke the SUT
    actual = a()  # Here we invoke a(), which is what we are testing, which will then invoke b() (which is the
    # dependency that we mock)

    # Assert: failing the test if the assertion is not True
    # An assert, if False, produces an exception that will fail the test
    assert (actual == 99)


def test_c(mocker):

    def mock_get_all_users(self):
        return [(1, 'test123', '000-000-0001', True), (2, 'testing123', '111-111-1111', False)]

    # Arrange
    mocker.patch('app.UserDao.get_all_users', mock_get_all_users)

    # Act
    actual = c()

    print(actual)

    # Assert
    assert actual == [(1, 'test123', '000-000-0001', True), (2, 'testing123', '111-111-1111', False)]
