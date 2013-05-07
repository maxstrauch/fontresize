FontResize
==========

This is a simple Eclipse plugin to change the font size very fast during a beamer
presentation or something similar.

Please notice that the source code was adapted from the project http://code.google.com/p/eclipse-fonts/

# How to get and install it

* Go the "plugins" folder in this repo and get the latest "FontResize_*.jar" or click here: https://github.com/maxstrauch/fontresize/raw/master/plugins/FontResize_1.42.0.jar
* Copy this file into the "plugins" folder located in the root directory of your Eclipse installation
* (Re-)Start Eclipse; two nice looking icons should appear

# How to use it

Use the two icons to decrease or increase the font size of the editor section. There are also this
shortcuts available (don't type the plus character):

* CMD + 0 (Mac), CTRL + 0 (Windows) to increase the font size
* CMT + - (Mac), CTRL + 0 (Windows) to decrease the font size

This plugin was tested on:
* Eclipse Juno (4.2.2) / Mac OS X 10.8.2
* Eclipse Juno (4.2.2) / Windows 7 Professional x32

It should also work on older Eclipse versions.

# License

See LICENSE.txt in the repo.

# Some errors - nothing works

If you get in trouble and nothing works try this:
* Close Eclipse and open your favorit cammand interpreter
* Bring the command prompt into the root directory of the Eclipse installation
* Type "eclipse.exe -clean" on Windows and "./eclipse -clean" on Mac or Linux
* After start close Eclipse and run it again. Now everything should work fine. If not try to figure out how to solve the problem and let me know your solution
