SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRC_URI = "https://pypi.python.org/packages/ae/d3/2bcc417b127e7230b67cb65ecb7b3865af8d7ea2f7f458c203facbe961eb/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1883525b93a5014d1aeda31e7b64ee20"
SRC_URI[sha256sum] = "32c41a144f64c30c37d94e4e5d1916e611f39019f7b44c45c47bfdb91702c000"

S = "${WORKDIR}/${PN}-${PV}"

inherit setuptools

