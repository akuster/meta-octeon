FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-3.14:"

KBRANCH_cavium-cn78xx ?= "standard/mti-malta64"
KBRANCH_cavium-cn78xx-64 ?= "standard/mti-malta64"
KBRANCH_router-ref-cn71xx ?= "standard/mti-malta64"
KBRANCH_router-ref-cn71xx-64 ?= "standard/mti-malta64"

SRCREV_machine_cavium-cn78xx ?= "a63d40b860a6d255005a541894d53729090b40ea"
SRCREV_machine_cavium-cn78xx-64 ?= "a63d40b860a6d255005a541894d53729090b40ea"
SRCREV_machine_router-ref-cn71xx ?= "a63d40b860a6d255005a541894d53729090b40ea"
SRCREV_machine_router-ref-cn71xx-64 ?= "a63d40b860a6d255005a541894d53729090b40ea"

SRC_URI += "file://defconfig"
SRC_URI += "file://0001-MPI-MIPS-Fix-compilation-error-with-GCC-5.1.patch \
    file://0001-lib-mpi-Use-static-inline-instead-of-extern-inline-i.patch \
    file://0001-cvmx-pcie-disable-via-config-option.patch \
    "

KCONF_BSP_AUDIT_LEVEL = "0"
COMPATIBLE_MACHINE_cavium-cn78xx = "cavium-cn78xx"
COMPATIBLE_MACHINE_cavium-cn78xx-64 = "cavium-cn78xx-64"
COMPATIBLE_MACHINE_router-ref-cn71xx = "router-ref-cn71xx"
COMPATIBLE_MACHINE_router-ref-cn71xx-64 = "router-ref-cn71xx-64"
