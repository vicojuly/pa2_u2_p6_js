INSERT INTO public.estudiante(
	estu_id, 
    estu_apellido, 
    estu_fecha_nacimiento, 
    estu_nombre, 
    estu_genero)
VALUES (
    nextval('sec_estudiante'), 
    'Ramirez', 
    '2007-12-15', 
    'Pepe', 
    'M'
    );