LICENSE = "MIT & Apache-2.0 & GPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
		    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
		    file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

HOMEPAGE = "https://github.com/dronekit/dronekit-sitl/"
SUMMARY = "DroneKit library to run SITL (simulation environment)"

SRC_URI = "git://github.com/dronekit/dronekit-sitl.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "548b0cb30a546ccfe03066db00e38805908d4bf3"

S = "${WORKDIR}/git"

inherit setuptools
