{$CLEO .csa}

script_name "AxelBlaze"
    0652: 10@ = integer_stat 130 
    0AAC: 5@ = load_audio_stream "AxelBlaze\headshot.mp3"
    16@ = 0 

:headshot_19
    0652: 11@ = integer_stat 130 
    wait 0 
    if 
    001C:   11@ > 10@ // (int) 
    jf @headshot_19
    0084: 10@ = 11@ // (int)  
    11@ *= 500
    0109: player $PLAYER_CHAR money += 11@

:headshot_179
    0390: load_txd_dictionary 'HDSHOT' 
    038F: load_texture "AXBL\EF\HS.png" as 101
    03F0: enable_text_draw 1 
    0AAD: set_audio_stream 5@ state 1

:headshot_302
    wait 0 
    0@ = -150.0 
    1@ = 200.0 
    2@ = 255.0 
    3@ = 1.0 
jump @headshot_429 

:headshot_429
    wait 0 
    005B: 0@ += 1@ // (float) 
    1@ /= 1.5 
    if 
    1.0 > 1@ 
    jf @headshot_490 
    3@ *= 1.1
    0063: 2@ -= 3@ // (float) 

:headshot_490
    if 
    2@ > 0 
    jf @headshot_562 
    0092: 4@ = float 2@ to_integer
    03E3: set_texture_to_be_drawn_antialiased 1     
    038D: draw_texture 101 position 330.0 130.0 size 300.0 75.0 RGBA 255 255 255 4@ 
jump @headshot_429 

:headshot_562
    1@ = 0 

:headshot_585
    0085: 0@ = 1@ // (int) 
    2@ = 0 
jump @headshot_19
