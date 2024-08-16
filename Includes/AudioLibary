:Axel_19 
    0652: 11@ = integer_stat 121    
    wait 0  
    if 
    001C:   11@ > 10@ // (int) 
    jf @Axel_19
    if
    6@ < 1
    jf @Axel_20
    0AAD: set_audio_stream 12@ state 1
    0084: 10@ = 11@ // (int) 
    6@ = 1
    33@ = 0
jump @Axel_30 
             
:Axel_20
    if and
    6@ < 2
    6@ > 0
    jf @Axel_21
    if
    33@ <= 5000
    jf @Axel_21
    0AAD: set_audio_stream 13@ state 1
    0084: 10@ = 11@ // (int) 
    6@ = 2
    33@ = 0
jump @Axel_30

:Axel_21
    if and
    6@ < 3
    6@ > 1
    jf @Axel_22
    if
    33@ <= 5000
    jf @Axel_22
    0AAD: set_audio_stream 14@ state 1
    0084: 10@ = 11@ // (int) 
    6@ = 3
    33@ = 0
jump @Axel_30

:Axel_22
    if
    6@ > 2
    jf @Axel_23
    if
    33@ <= 5000
    jf @Axel_23
    0AAD: set_audio_stream 15@ state 1
    0084: 10@ = 11@ // (int) 
    6@ = 4
    33@ = 0
jump @Axel_30

:Axel_23
    if
    33@ >= 5000
    jf @Axel_19
    6@ = 0
jump @Axel_19
