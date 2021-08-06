import cv2 as cv
import numpy as np



def Detect(frame,side):
    row1 = [0,0,0]
    row2 = [0,0,0]
    row3 = [0,0,0]
    line = [row1,row2,row3] 
    counter = 0
    img = frame

    img = img[(int(img.shape[0]*0.3)):(int(img.shape[0]*0.7)),(int(img.shape[1]*0.3)):(int(img.shape[1]*0.7-75))]
    cv.imshow("img",img)
    

    
    #To change image from RGB to HSV
    hsvFrame = cv.cvtColor(img,cv.COLOR_BGR2HSV)

    #defining the range of red Colour
    red_lower=np.array([161,155,84],dtype=np.uint8)
    red_upper=np.array([180,255,255],dtype=np.uint8)

    #defining the range of the blue color
    blue_lower=np.array([94, 80, 2],dtype=np.uint8)
    blue_upper=np.array([126, 255, 255],dtype=np.uint8)

    #defining the range of yellow color
    yellow_lower=np.array([24,100,100],dtype=np.uint8)
    yellow_upper=np.array([37,255,255],dtype=np.uint8)

    #defining the range of green color
    green_lower=np.array([42,100,100],dtype=np.uint8)
    green_upper=np.array([75,255,255],dtype=np.uint8)

    #defining the range of orange color
    orange_lower=np.array([5, 50, 50],dtype=np.uint8)
    orange_upper=np.array([17, 255, 255],dtype=np.uint8)

    #defining the range of white color
    white_lower=np.array([70,10,130],dtype=np.uint8)
    white_upper=np.array([180,110,255],dtype=np.uint8)

    #Making masks for each color
    
    red=cv.inRange(hsvFrame,red_lower,red_upper)

    blue=cv.inRange(hsvFrame,blue_lower,blue_upper)

    yellow=cv.inRange(hsvFrame,yellow_lower,yellow_upper)

    green=cv.inRange(hsvFrame,green_lower,green_upper)

    orange=cv.inRange(hsvFrame,orange_lower,orange_upper)

    white=cv.inRange(hsvFrame,white_lower,white_upper)

    colors = [orange,white,green,yellow,red,blue]

    #List of Values
    Val = ['O','W','G','Y','R','B']

    #Loop to check for colors

    area = ((img.shape[0]*img.shape[1])/9)

    for index,color in enumerate(colors):    

        a=0
        for i in range(0,3):
            b=0
            for k in range(0,3):
                check = color[int(color.shape[0]*i/3):int(color.shape[0]*(i+1)/3),int(color.shape[1]*k/3):int(color.shape[1]*(k+1)/3)]
                check_color = np.sum(check)
                cv.imshow("img",check)
                print(check_color)
                
                                
                if check_color>=20000:
                    line[a][b] = Val[index]

                
                b+=1
            a+=1
                   
                   
    side.append(line[0])
    side.append(line[1])
    side.append(line[2])

    return

def Det(frame,side):
    row1 = [0,0,0]
    row2 = [0,0,0]
    row3 = [0,0,0]
    line = [row1,row2,row3] 
    counter = 0
    img = frame

    img = img[(int(img.shape[0]*0.3)):(int(img.shape[0]*0.7)),(int(img.shape[1]*0.3)):(int(img.shape[1]*0.7-65))]
    color = img
    a=0
    for i in range(0,3):
        b=0
        
        for k in range(0,3):
            check = color[int(color.shape[0]*i/3):int(color.shape[0]*(i+1)/3),int(color.shape[1]*k/3):int(color.shape[1]*(k+1)/3)]

            #To change image from RGB to HSV
            hsvFrame = cv.cvtColor(check,cv.COLOR_BGR2HSV)
            hsvFrame = cv.medianBlur(hsvFrame,3)

             

            #defining the range of red Colour
            red_lower=np.array([161,155,84],dtype=np.uint8)
            red_upper=np.array([180,255,255],dtype=np.uint8)

            #defining the range of the blue color
            blue_lower=np.array([94, 80, 2],dtype=np.uint8)
            blue_upper=np.array([126, 255, 255],dtype=np.uint8)

            #defining the range of yellow color
            yellow_lower=np.array([24,100,100],dtype=np.uint8)
            yellow_upper=np.array([37,255,255],dtype=np.uint8)

            #defining the range of green color
            green_lower=np.array([42,100,100],dtype=np.uint8)
            green_upper=np.array([75,255,255],dtype=np.uint8)

            #defining the range of orange color
            orange_lower=np.array([5, 50, 50],dtype=np.uint8)
            orange_upper=np.array([17, 255, 255],dtype=np.uint8)

            #defining the range of white color
            white_lower=np.array([70,10,130],dtype=np.uint8)
            white_upper=np.array([180,110,255],dtype=np.uint8)

            #Making masks for each color
    
            red=cv.inRange(hsvFrame,red_lower,red_upper)

            blue=cv.inRange(hsvFrame,blue_lower,blue_upper)

            yellow=cv.inRange(hsvFrame,yellow_lower,yellow_upper)

            green=cv.inRange(hsvFrame,green_lower,green_upper)

            orange=cv.inRange(hsvFrame,orange_lower,orange_upper)

            white=cv.inRange(hsvFrame,white_lower,white_upper)


            if np.sum(yellow)>100000:
                line[a][b]="Y"     
            if np.sum(blue)>100000:
                line[a][b]="B"
            if np.sum(green)>120000:
                line[a][b]="G"
            if np.sum(orange)>100000:
                line[a][b]="O"                 
            if np.sum(white)>100000:
                line[a][b]="W"   
            if np.sum(red)>70000:
                line[a][b]="R" 
 
            b+=1
        a+=1
    
    side[0]=(line[0])
    side[1]=(line[1])
    side[2]=(line[2])

    return

  

    
    









