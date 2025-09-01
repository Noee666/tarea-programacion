try:
    year = int(input("Ingresa un año: "))
except ValueError:
    print("El formato ingresado no es válido")
    exit()

if year > 2025 or year < 1:
    print("El año ingresado no es válido")
    exit()

try:
    mes = int(input("Introduce un mes (Enero=1, Febrero=2, ...): "))
except ValueError:
    print("El formato ingresado no es válido")
    exit()

if mes < 1 or mes > 12:
    print("El mes ingresado no es válido")
    exit()

try:
    dia = int(input("Introduce un día: "))
except ValueError:
    print("El formato ingresado no es válido")
    exit()

fecha_valida = True

if mes in [1, 3, 5, 7, 8, 10, 12]:
    if dia < 1 or dia > 31:
        fecha_valida = False

elif mes in [4, 6, 9, 11]:
    if dia < 1 or dia > 30:
        fecha_valida = False

elif mes == 2:
    es_bisiesto = (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)
    if es_bisiesto:
        if dia < 1 or dia > 29:
            fecha_valida = False
    else:
        if dia < 1 or dia > 28:
            fecha_valida = False

if fecha_valida:
    print(f"La fecha {dia}/{mes}/{year} es válida ")
else:
    print("La fecha ingresada no es válida ")
