DESCRIPTION = "U-Boot port for abesis"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i)"

DEFAULT_PREFERENCE_sun4i="1"
DEFAULT_PREFERENCE_sun5i="1"
DEFAULT_PREFERENCE_sun7i="1"

# Sunxi U-Boot uses different names for some boards
UBOOT_MACHINE_olinuxino-a20 = "A20-OLinuXino-Micro_config"
UBOOT_MACHINE_olinuxino-a10s = "A10s-OLinuXino-Micro_config"
UBOOT_MACHINE_meleg = "Mele_A1000G_config"


SRC_URI = " \
 	git://github.com/izzetaykutkocak/u-boot-abesis.git;protocol=https;branch=master \
 	file://0002-gcc5-fixes.patch \
 	"
PE = "1"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SPL_BINARY="u-boot-abesis-with-spl.bin"
