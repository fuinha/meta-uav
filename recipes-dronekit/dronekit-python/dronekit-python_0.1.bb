LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

HOMEPAGE = "https://github.com/dronekit/dronekit-python"
SUMMARY = "Developer Tools for Drones."

SRC_URI = "git://github.com/dronekit/dronekit-python.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "f2a531a9a3a173cbc5b9b5f0eb5e6d7a90e64244"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} = "\
                python-json \
                python-argparse \
                python-psutil \
                python-six \
                python-monotonic \
                pymavlink \
                "
