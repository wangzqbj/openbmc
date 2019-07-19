SUMMARY = "Inspur NCSI Card Check"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${INSPURBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"

inherit allarch
inherit obmc-phosphor-systemd

S = "${WORKDIR}"

SRC_URI += "file://inspur-ncsi-card-check.sh"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/inspur-ncsi-card-check.sh ${D}${bindir}/inspur-ncsi-card-check.sh
}

SYSTEMD_SERVICE_${PN} += "inspur-ncsi-card-check.service"
