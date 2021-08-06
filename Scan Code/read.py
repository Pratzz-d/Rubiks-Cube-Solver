import cv2 as cv
import numpy as np
import ColorDetection as cd
import File

front=[0,0,0]
right = [0,0,0]
back = [0,0,0]
left = [0,0,0]
top = [0,0,0]
bottom = [0,0,0]
Cube = (front,right,back,left,top,bottom)

blank = np.zeros((500,500,1),dtype = 'uint8')

count=0
switch = {0:"Front Side",1:"Right Side",2:"Back side",3:" Left Side",4:"Top",5:"Bottom"}
#Starting the video capture

cap = cv.VideoCapture(0)
while True:
    isTrue, frame = cap.read()
    img = frame
    #To diplay the text
    if count<6:
        cv.putText(frame,'Press [___] to scan the:',(0,30), cv.FONT_HERSHEY_COMPLEX,1.0,(255,255,102),2)
        cv.putText(frame,switch[count],(415,30), cv.FONT_HERSHEY_COMPLEX,1.0,(255,255,102),2)
    else: cv.putText(frame,"CUBE IS SCANNED!",(230,255), cv.FONT_HERSHEY_COMPLEX,1.0,(255,255,102),2)

    #To display alignment markings
    if count<6:
        img = cv.rectangle(img,(int(img.shape[1]*0.3),int(img.shape[0]*0.3)),(int(img.shape[1]*0.7-65),int(img.shape[0]*0.7)),(120,125,43),thickness=2)
        #for i in range(1,7,2):
            #for k in range(1,7,2):
                #cv.rectangle(frame,(71*k + 50,71*i+20),(71*(k+1)+ 50,71*(i+1)+ 20),(0,255,255),thickness=2)

    
    
    #To take in scan key
    while count<6:
        if cv.waitKey(20) == 32:


            cd.Det(frame,Cube[count])
            count+=1
        break
            
        
        
    #To output the frame
    cv.imshow('camera', frame)

    

    #To stop the video press d
    if cv.waitKey(20) & 0xFF==ord('d'):
        break  
   

cap.release()
cv.destroyAllWindows()

print(Cube)

File.ColorWriter(Cube)


