FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_fp5280g2 = " file://fp5280g2.cfg \
			file://0001-ARM-dts-aspeed-Add-Inspur-fp5280g2-BMC-machine.patch"
