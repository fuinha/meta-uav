SUMMARY = "MAVLink micro air vehicle marshalling / communication library"
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=54ad3cbe91bebcf6b1823970ff1fb97f"

PV = "1.0.9"
SRCREV = "27f2a20333e1d20e6834cc279045bd700bbfb2b2"
SRC_URI = "gitsm://github.com/mavlink/mavlink.git \
          "

S = "${WORKDIR}/git"

inherit cmake pythonnative

PARALLEL_MAKE = ""
OECMAKE_SOURCEPATH = "${S}"
OECMAKE_BUILDPATH = "${S}/build-${TARGET_ARCH}-${PV}"


FILES_${PN} += "${libdir}/*"
