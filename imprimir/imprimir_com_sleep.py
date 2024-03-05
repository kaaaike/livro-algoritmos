from time import sleep

def imprime_itens(lista):
    for item in lista:
        sleep(1)
        print (item)

def ler_arquivo(nome_arquivo):
    with open(nome_arquivo, 'r') as arquivo:
        conteudo = arquivo.readlines()
    return conteudo

# Exemplo de uso: Ler um arquivo e imprimir seu conteúdo
conteudo_arquivo = ler_arquivo('arquivo.txt')
imprime_itens(conteudo_arquivo)
