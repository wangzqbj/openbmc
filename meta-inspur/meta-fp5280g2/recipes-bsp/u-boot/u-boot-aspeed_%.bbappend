FILESEXTRAPATHS_prepend_fp5280g2 := "${THISDIR}/${PN}:"
SRC_URI_append_fp5280g2 = " file://0001-board-aspeed-Add-reset_phy-for-Zaius.patch \
                         file://0002-board-aspeed-aspeednic-Use-MAC2-for-networking.patch"
