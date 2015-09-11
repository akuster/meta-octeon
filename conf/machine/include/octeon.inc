# Cavium Octeon Soc 
include conf/machine/include/octeon-default-settings.inc
include conf/machine/include/octeon-default-version.inc
include conf/machine/include/octeon-default-providers.inc

SOC_FAMILY = "octeon"
include conf/machine/include/soc-family.inc

require conf/machine/include/tune-octeon.inc
