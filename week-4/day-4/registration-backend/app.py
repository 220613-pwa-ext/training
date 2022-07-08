from flask import Flask
from controller.user_controller import uc

if __name__ == "__main__":
    app = Flask(__name__)

    app.register_blueprint(uc)

    app.run(host="0.0.0.0", port=8080, debug=True)
