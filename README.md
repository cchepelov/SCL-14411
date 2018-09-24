Example to discuss https://youtrack.jetbrains.com/issue/SCL-14411

This project is a multi-module project made by accreting (sometimes dozens) of independent projects, each living in a
separate repo and with their own CI.

(for the purpose of loading the project within IDEA, please "sbt publishLocal" each of the projects once)

Please note that this project is made of three modules, each of which should be "added from existing sources" into 
a blank project.

The ?/.idea/?.iml files are (exceptionally) provided within this repo to demonstrate what is built manually
but immediately destroyed by the SBT import; the purpose of SCL-14411 is to request that the "sbt import" process
either automatically re-creates those inter-module links, or at least leaves them in place in case these were
manually built by the user. 

