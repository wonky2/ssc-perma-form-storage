advancement revoke @s only minecraft:eat_snow_fox_shard
execute unless predicate ssc-perma-form-storage:is_human run give @s ssc-perma-form-storage:gilded_echo_shard{display:{Name:'[{"text":"Gilded Echo Shard (Snow Fox)","italic":false,"color":"light_purple"}]'},Tags:{storedForm:"snow_fox_3"}}
execute if predicate ssc-perma-form-storage:is_human run give @s ssc-perma-form-storage:cracked_gilded_echo_shard
execute if predicate ssc-perma-form-storage:is_human run shape_shifter_curse transform_to_form @s shape-shifter-curse:snow_fox_3
