from flask import Flask

app = Flask(__name__)


@app.route('/test', methods=['GET'])
def test():
    return "Hello World"


if __name__ == '__main__':
    app.run(host="0.0.0.0", port=8080)
