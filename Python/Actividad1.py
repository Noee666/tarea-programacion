angle = int(input("Ingresa un angulo "))

if angle < 90:
    print(f"{angle} es un angulo agudo\n")
if angle > 90:
    print(f"{angle} es un angulo obtuso\n")
if angle == 90:
    print(f"{angle} es un angulo recto\n")
