LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/wangzqbj/inspur-ncsi-switch;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "1096cab676b649b17012988afb9f5d8dd6b82763"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
inherit pythonnative
inherit systemd
inherit obmc-phosphor-systemd

DEPENDS += "autoconf-archive-native"
DEPENDS += "systemd"
DEPENDS += "sdbusplus"
DEPENDS += "sdbus++-native"

SYSTEMD_SERVICE_${PN} = " \
			inspur-ncsi-switch@.service \
			inspur-ncsi-manager.service \ 
			"
TMPL = "inspur-ncsi-switch@.service"
INSTFMT = "inspur-ncsi-switch@{0}.service"
FMT = "${TMPL}:${INSTFMT}"

INSPUR_NCSI_PCIE = "pcie"
INSPUR_NCSI_OCP = "ocp"

SYSTEMD_LINK_${PN} += "${@compose_list(d,'FMT','INSPUR_NCSI_PCIE')}"
SYSTEMD_LINK_${PN} += "${@compose_list(d,'FMT','INSPUR_NCSI_OCP')}"
