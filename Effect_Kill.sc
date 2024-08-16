{$CLEO .csa}

script_name "AxelBlaze"

{$Include Includes\AudioLibary.h}

:Axel_30
    0390: load_txd_dictionary 'AB' 
    038F: load_texture "AXBL\EF\1K.png" as 102 
    038F: load_texture "AXBL\EF\2K.png" as 103  
    038F: load_texture "AXBL\EF\3K.png" as 104  
    038F: load_texture "AXBL\EF\CH.png" as 105  
    03F0: enable_text_draw 1 

:Axel_40
    wait 0 
    0@ = -150.0 
    1@ = 200.0 
    2@ = 255.0 
    3@ = 1.0 
jump @Axel_50 

:Axel_50
    wait 0 
    005B: 0@ += 1@ // (float) 
    1@ /= 1.5 
    if 
    1.0 > 1@ 
    jf @Axel_60 
    3@ *= 1.1
    0063: 2@ -= 3@ // (float) 

:Axel_60
    if and 
    2@ > 0 
    6@ < 2
    jf @Axel_61
    0092: 4@ = float 2@ to_integer
    03E3: set_texture_to_be_drawn_antialiased 1     
    038D: draw_texture 102 position 330.0 100.0 size 300.0 75.0 RGBA 255 255 255 4@ 
jump @Axel_50 

:Axel_61
    if and 
    2@ > 0 
    6@ > 0
    6@ < 3
    jf @Axel_62
    0092: 4@ = float 2@ to_integer
    03E3: set_texture_to_be_drawn_antialiased 1     
    038D: draw_texture 103 position 330.0 100.0 size 300.0 75.0 RGBA 255 255 255 4@ 
jump @Axel_50 

:Axel_62
    if and 
    2@ > 0 
    6@ > 2
    6@ < 4
    jf @Axel_63
    0092: 4@ = float 2@ to_integer
    03E3: set_texture_to_be_drawn_antialiased 1     
    038D: draw_texture 104 position 330.0 100.0 size 300.0 75.0 RGBA 255 255 255 4@ 
jump @Axel_50 

:Axel_63
    if and 
    2@ > 0 
    6@ > 3
    jf @Axel_270 
    0092: 4@ = float 2@ to_integer
    03E3: set_texture_to_be_drawn_antialiased 1     
    038D: draw_texture 105 position 330.0 100.0 size 300.0 75.0 RGBA 255 255 255 4@   
jump @Axel_50    

:Axel_270
    1@ = 0 

:Axel_280
    0085: 0@ = 1@ // (int) 
    2@ = 0 
jump @Axel_19
