
# tasks
- Make gameprofiles change between regions (Ohad)
- Make new worldgaurd region when newtown command is run
- setclass player join server listener
- gradle build pipleline to reload plugin on server after build artifacts


JSON Template for storing towns
```json
{
   regions:
      {
         pooptown: {
            location: (x,y),
            owner: UUID,
            creationDate,
            lastWarped,
            ...
         },
         othertown: {
            location: (x,y),
            owner: UUID,
            creationDate,
            lastWarped,
            ...
         }
      }
}
```

# comands

* /newtown
command:
creates a new worldgaurd region, teleports you to it
no one can leave or enter region unless teleported by a coach
inventories reset for each region
nicknames reset for each region
reset nether
respawn dragon
(make sure there is an end portal in each region, modify endereye functionality to only work to region portal)

* /newparty (template)
creates two new towns, one creative one survival
load in a template

* /warp (townname)
if no warp permissions, do not list available warps, instead warp back to active class town

* /setclass (class warp name)
command:
teleport anyone who logs in to this warp

* /explorer (student name)
command: lets them bypass region protection for 4 hours

## permissions:
* coach
   create towns, delete the towns they created, start and reset party mode
* admin
   can delete towns, create templates, delete templates

to create new regions,
spiral 4x4 regions, with one region buffer
