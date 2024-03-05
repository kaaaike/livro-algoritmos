from collections import deque

grafo = {
    "voce": ["Alice", "Bob", "Claire"],
    "Bob": ["Anuj", "Peggy"],
    "Alice": ["Peggy"],
    "Claire": ["Thom", "Jonny"],
    "Anuj": [],
    "Peggy": [],
    "Thom": [],
    "Jonny": []
}

def pessoa_e_vendedor(pessoa):
    return pessoa[-1] == 'm'


def pesquisa(nome):
    fila_de_pesquisa = deque()
    fila_de_pesquisa += grafo[nome]
    verificadas = []

    while fila_de_pesquisa:
        pessoa = fila_de_pesquisa.popleft()

        if not pessoa in verificadas:
            if pessoa_e_vendedor(pessoa):
                print(pessoa + " é um vendedor de Manga!")
                return True
            else:
                fila_de_pesquisa += grafo[pessoa]
                verificadas.append(pessoa)
    return False

pesquisa("voce")
