LICENSE = "MIT & Apache-2.0 & GPL-3.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
		    file://COPYINGv3;md5=d32239bcb673463ab874e80d47fae504 \
		    file://COPYING.APACHE;md5=d2794c0df5b907fdace235a619d80314"

HOMEPAGE = "https://github.com/dronekit/dronekit-sitl/"
SUMMARY = "DroneKit library to run SITL (simulation environment)"

SRC_URI = "\
	git://github.com/dronekit/dronekit-sitl.git;protocol=https \
	file://COPYINGv3 \
	file://COPYING.APACHE"

PV = "1.0+git${SRCPV}"
SRCREV = "548b0cb30a546ccfe03066db00e38805908d4bf3"

S = "${WORKDIR}/git"

do_configure_prepend() {
#do_copy_license() {
        cp ${WORKDIR}/COPYINGv3 ${S}/COPYINGv3
        cp ${WORKDIR}/COPYING.APACHE ${S}/COPYING.APACHE
}

#addtask copy_license before do_configure

inherit setuptools
