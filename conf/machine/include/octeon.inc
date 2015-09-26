# Cavium Octeon Soc 

SOC_FAMILY = "octeon"
include conf/machine/include/soc-family.inc
require conf/machine/include/tune-octeon.inc

IMAGE_FSTYPES ?= " ext4 tar.gz"

SERIAL_CONSOLE ?= "115200 ttyS0"

MACHINE_EXTRA_RRECOMMENDS ?= " kernel-modules"
PREFERRED_VERSION_linux-yocto ?= "3.14%"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"
