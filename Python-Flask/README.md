Flask-Dojo
==========

This repository holds files for a coding dojo on the Flask microframework.

The files:

[app.py](app.py)
----------------
Entry point for the application developed. This holds the Flask application, it's methods, routes, everything.

[tests.py](tests.py)
--------------------
Unit test codes for the application on [app.py](app.py). Should be run with `python tests.py`.

[setup.py](setup.py)
--------------------
Setuptools script to install dependencies for the project and contain relevant information about it.

[rotation.fish](rotation.fish)
------------------------------
Shell script to force pilot rotation, sleeping for a set amount of time, then asking info about the next pilot. On fish because that's what I use.
