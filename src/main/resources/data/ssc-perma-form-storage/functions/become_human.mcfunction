advancement revoke @s only minecraft:eat_empty_shard

execute unless predicate ssc-perma-form-storage:is_perma_form run give @s ssc-perma-form-storage:empty_gilded_echo_shard

execute if predicate ssc-perma-form-storage:is_anubis_wolf run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Anubis Wolf)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"anubis_wolf_3"}}
execute if predicate ssc-perma-form-storage:is_axolotl run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Axolotl)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"axolotl_3"}}
execute if predicate ssc-perma-form-storage:is_bat run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Bat)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"bat_3"}}
execute if predicate ssc-perma-form-storage:is_familiar_fox run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Familiar Fox)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"familiar_fox_3"}}
execute if predicate ssc-perma-form-storage:is_ocelot run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Ocelot)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"ocelot_3"}}
execute if predicate ssc-perma-form-storage:is_snow_fox run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Snow Fox)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"snow_fox_3"}}
execute if predicate ssc-perma-form-storage:is_spider run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Spider)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"spider_3"}}

execute if predicate ssc-perma-form-storage:is_perma_form run shape_shifter_curse transform_to_form @s shape-shifter-curse:original_shifter