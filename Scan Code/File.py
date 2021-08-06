def ColorWriter(Cube):
    #Open File
    file = open('resource.txt','w') #location of resource file

    #Loops to get Values from Cube
    for side in Cube:
        for row in side:
            for i in row:
                file.write(i+" ")
        file.write("\n")


    file.close()

