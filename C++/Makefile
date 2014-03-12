############################# Makefile ##########################
#Definimos a variável
CC=gcc
CPP=g++
INCS=
LIBS=
#CFLAGS=-W -Wall -ansi -pedantic -std=c99 ${INCS}
CFLAGS=-std=c99 ${INCS}
LDFLAGS=
TARGET=main
SRCS=$(wildcard *.cpp) $(wildcard *.c)
OBJS=$(SRCS:.cpp=.o)

all: $(TARGET)

# $@ = teste:
# $^ = teste.o main.o
$(TARGET): $(OBJS)
	$(CPP) -o $@ $^ ${LDFLAGS}
%.o: %.c
	$(CPP) -c $^ -o $@  $(CFLAGS)


clean: 
	rm -rf *.o
	rm -rf *~
cleanAll: clean
	rm -rf $(TARGET)

teste: $(TARGET)
	./$^

testeIn: $(TARGET)
	./$^ < in.txt
