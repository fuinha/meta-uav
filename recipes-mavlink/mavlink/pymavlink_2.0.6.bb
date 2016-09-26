SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "984cbd244bc17159a2bbcfb68ec508fab8a9ea6d"
SRC_URI = "git://github.com/ArduPilot/pymavlink.git"

S = "${WORKDIR}/git"

inherit setuptools

