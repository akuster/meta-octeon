SECTION = "kernel"
DESCRIPTION = "Linux kernel for Octeon devices"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

# Look in the generic major.minor directory for files
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-4.2:"

S = "${WORKDIR}/git"

KBRANCH ?= "linux-4.2.y"
KBRANCH_cavium-cn78xx ?= "linux-4.2.y"
KBRANCH_cavium-cn78xx-64 ?= "linux-4.2.y"
KBRANCH_router-ref-cn71xx ?= "linux-4.2.y"
KBRANCH_router-ref-cn71xx-64 ?= "linux-4.2.y"

SRCREV_machine_cavium-cn78xx ?= "6bc417033ecb9c5d047d6a030c78fc2748c05d8d"
SRCREV_machine_cavium-cn78xx-64 ?= "6bc417033ecb9c5d047d6a030c78fc2748c05d8d"
SRCREV_machine_router-ref-cn71xx ?= "d5acffd0406eae6c14a9057ecc6354cf5bb2be58"
SRCREV_machine_router-ref-cn71xx-64 ?= "d5acffd0406eae6c14a9057ecc6354cf5bb2be58"

PV = "4.2+git${SRCPV}"

SRC_URI = "git:///home/akuster/work/repos/opensource/upstream-stable-kernel;protocol=file;branch=${KBRANCH};name=machine"

SRC_URI += "file://defconfig"

KCONF_BSP_AUDIT_LEVEL = "0"
COMPATIBLE_MACHINE_cavium-cn78xx = "cavium-cn78xx"
COMPATIBLE_MACHINE_cavium-cn78xx-64 = "cavium-cn78xx-64"
COMPATIBLE_MACHINE_router-ref-cn71xx = "router-ref-cn71xx"
COMPATIBLE_MACHINE_router-ref-cn71xx-64 = "router-ref-cn71xx-64"
