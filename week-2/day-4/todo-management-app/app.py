from flask import Flask
from controller.user_controller import uc

# The purpose of this if statement is so that if another file imports this file, then
# the code inside of the if block will not run, since __name__ would not be __main__
# in that situation
if __name__ == '__main__':
    app = Flask(__name__)

    app.register_blueprint(uc)

    app.run(port=8080, debug=True)
