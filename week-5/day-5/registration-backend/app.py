from flask import Flask
from controller.user_controller import uc
from flask_cors import CORS

if __name__ == "__main__":
    app = Flask(__name__)
    CORS(app)

    app.register_blueprint(uc)

    app.run(host="0.0.0.0", port=8080, debug=True)
