#include <stdio.h>
#include "runner.h"

int codingdojo(int a){
	return a;
}

int teste_a(){
	_assert( codingdojo(1) == 1 );
	
	return 0;
}

int teste_b(){
	_assert( codingdojo(-1) == -1 );
	
	return 0;
}

int todos_testes() {
	_verify(teste_a);
	_verify(teste_b);
	
	return 0;
}

int main(){
	int resultado = todos_testes();
	
	if(resultado == 0){
		printf("TODOS OS TESTES PASSARAM!\n");
	} else {
		printf("%d\n", resultado);
	}
	
	printf("Testes rodados: %d\n", tests_run);
	
	return 0;
}
