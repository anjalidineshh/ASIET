#include<sys/types.h>
#include<stdio.h>  
#include<unistd.h>
#include<sys/stat.h> 
#include<string.h>
#include<fcntl.h>
int main(){
int fd,fd2;
char wbuf[128];
char rbuf[128];
fd=open("file.txt",O_RDWR);
printf("Enter the text to be written:");
scanf("%s",wbuf);
write(fd,wbuf,strlen(wbuf));
close(fd);
fd2=open("file.txt",O_RDWR);
printf("The contents are:");
read(fd2,rbuf,100);
printf("%s \n",rbuf);
close(fd2);
return 0;
}
