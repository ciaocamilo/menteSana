package com.example.mentesana.model;

public class Data {

    private  Componente datos[];

    public Data() {
        datos = new Componente[5];
        llenarDatos();
    }

    public void llenarDatos(){
        String nombre = "";
        String definicion = "";
        String metafora = "";
        String video = "";
        String ejercicio = "";
        String videoEjercicio = "";

        /* ** ESTAR PRESENTE ** */
        nombre = "Estar presente";
        definicion = ", es importante prestar atención de manera consciente a la experiencia del presente con interés, curiosidad y aceptación.\n\nMuchas veces nos preocupamos en exceso por lo que ha sucedido o por lo que vendrá dejando a un lado el momento que estamos viviendo, haciendo que no nos concentremos, no podamos resolver eficazmente lo que se nos presenta y evitando que podamos disfrutar de la cotidianidad.";
        metafora = "Una de las prácticas que nos invitan a estar presentes es el mindfulness.\n\nA continuación una aproximación a esta práctica: 'Mindfulness: El arte de vivir conscientemente'";
        video = "https://www.youtube.com/watch?v=g6OY_jTsQXg";
        ejercicio = ", te invito a experimentar el presente de otra forma por medio de: “mindfulness en 3 minutos";
        videoEjercicio = "https://www.youtube.com/watch?v=0eiQQL4cWIM";
        datos[0] = new Componente(nombre, definicion, metafora, video, ejercicio, videoEjercicio);

        /* ** ACEPTACIÓN ** */
        nombre = "Aceptación";
        definicion = ", algunas veces no estamos dispuestos a entrar en contacto con nuestras sensaciones corporales, emociones, pensamientos, recuerdos e intentamos evitar o eliminar los que no nos agradan haciendo que nos sintamos peor.\n\nPermítete relacionarte de otra forma con esas experiencias para que no se conviertan en un obstáculo en la vida que deseas.";
        metafora = "Metáfora de las arenas movediza\n\n¿Recuerdas esas películas donde el personaje se hundía en arenas movedizas? Mientras el personaje más luchaba y se agitaba por escapar de las arenas, más termina hundiéndose en ellas.\n\nOcurre que al caer en arenas movedizas, los intentos de lucha son lo peor que podemos hacer. Lo único que se puede hacer con las arenas movedizas, es extender el cuerpo y tratar de entrar en contacto, lo más posible con ellas. Este es el truco.\n\nLos instintos te ordenan luchar, pero actuando de ese modo, terminarás ahogándote. Este mismo principio es aplicable a los sentimientos que no deseamos tener: mientras más luchemos por librarnos de ellos, más desbordados por ellos estaremos.\n\nAparentemente no suena lógico al principio, pero puede ser que lo que tengas que hacer, es parar de batallar y en lugar de ello, entrar en contacto total con lo que has estado tratando de evitar.";
        video = "https://www.youtube.com/watch?v=QZXauA-PGvI";
        ejercicio = ", es hora de probar algo nuevo. Realiza una  fotografía de una situación de tu vida que la mayoría de veces no te agrada.\n\nUtiliza nuevas perspectivas, ponle un toque de humor y haz click. Prepárate para ver de otra forma las cosas.";
        videoEjercicio = "";
        datos[1] = new Componente(nombre, definicion, metafora, video, ejercicio, videoEjercicio);

        /* ** VALORES ** */
        nombre = "Valores";
        definicion = ", clarificar lo que es más importante en nuestra vida, desde el fondo del corazón. Preguntarnos y cuestionarnos qué clase de persona queremos ser, desde qué valores actuamos y qué es lo significativo y valioso para nosotros/as.\n\nDespués podríamos establecer metas guiadas por valores e involucrarnos en acciones efectivas para alcanzarlas.El hecho de tener un compromiso, una dirección hacia donde deseamos movernos nos ayudará enormemente a ponernos en contacto y estar dispuesto/a a experimentar nuestras vivencias internas.";
        metafora = "Metáfora del pantano:\n\nImagínate que empiezas un viaje hacia una hermosa montaña, que puedes ver con total claridad a lo lejos. Pero cuando comienzas a caminar te das cuenta de que frente a ti hay un gran pantano.\n\nY piensas: ¡Qué es esto!, no sabía que tenía que atravesar este pantano. Es desagradable, incómodo, se me van a llenar los zapatos de lodo. No quiero mancharme. Estoy cansado/a. Por qué nadie me avisó del pantano. No es justo. No me merezco esto.\n\nAhora sabes que hay un pantano, es agua y barro nada más y que muchas veces encontrarás pantanos en tu vida que se interpongan en el camino hacia lo que para ti es importante.\n\nSi sabes que es importante puedes: Abandonar o entrar en él. ¿Qué eliges?";
        video = "";
        ejercicio = ", ¡¡cinéfilo!! Piensa en tres de tus personajes de películas favoritos e identifica qué es lo que más te gusta de ellos, de su forma de actuar, hablar y relacionarse con los demás.";
        videoEjercicio = "";
        datos[2] = new Componente(nombre, definicion, metafora, video, ejercicio, videoEjercicio);

        /* ** YO CONTEXTUAL ** */
        nombre = "Yo contextual";
        definicion = ", al estar implicados en el problema hace que no lo veamos objetivamente, de esta forma, si tomamos distancia de la situación, y los pensamientos y sentimientos relacionados podríamos ver más elementos que nos ayudaran a resolverlo.\n\nEs posible experimentar de manera directa que no somos nuestros pensamientos, emociones, recuerdos, impulsos o sensaciones.\n\nEstos fenómenos cambian constantemente y son aspectos periféricos de nosotros/as. No son la esencia de quienes somos.";
        metafora = "Metáfora de la casa y los muebles:\n\nImagínate una casa llena de muebles. Los muebles no son y nunca serán la casa. Simplemente estos están dentro de ella. La casa sólo contiene a los muebles que hemos puesto y les da un contexto para que puedan funcionar como muebles.\n\nAhora, podemos considerar a los muebles como buenos o malos. ¿Esto diría algo del valor de la casa? Claro que no, no diría nada de su valor porque una cosa son los muebles y otra la casa.\n\nPor tanto, lo que tú piensas o sientes (muebles) no conforman tu identidad (casa). No eres tú.";
        video = "";
        ejercicio = ", escribe un texto breve en tercera persona en el que cuentes la situación que a ti te está incomodando. Puedes imaginar a un personaje y ponerle un nombre (distinto al tuyo) y contar la situación como si le estuviera pasando a él. Habla de lo que piensa, siente y hace respecto a esa situación.\n\nAhora leela, ¿Qué opinas, encontraste algo nuevo, se ve mejor que antes?";
        videoEjercicio = "";
        datos[3] = new Componente(nombre, definicion, metafora, video, ejercicio, videoEjercicio);

        /* ** ACCIÓN ** */
        nombre = "Acción";
        definicion = ", para el desarrollo pleno de tu vida es necesario actuar de acuerdo a los valores que tienes como ser humano.\n\nSi ya identificaste que es importante para ti el siguiente paso es establecer qué acciones realizar.";
        metafora = "La acción significa movimiento, no falta de movimiento; la acción significa dar un paso positivo sin esperar a que te quedes sentado; la acción significa que te haces cargo y avanzas en lugar de esperar que las circunstancias cambien sin ningún esfuerzo de tu parte";
        video = "";
        ejercicio = ", haz lo que es importante para ti y muéstralo al mundo. Piensa en tres acciones que te llenen de emoción, te sientas orgulloso y quieras contarle al mundo sobre ellas.\n\nInvita a tus amigos si así lo deseas y ve por ellas, realizarlas. Toma una foto y publícala en tus redes.";
        videoEjercicio = "";
        datos[4] = new Componente(nombre, definicion, metafora, video, ejercicio, videoEjercicio);
    }

    public Componente obtenerDato(String comp){
        int index = 0;
        switch (comp){
            case "presente":
                index = 0;
                break;
            case "aceptacion":
                index = 1;
                break;
            case "valores":
                index = 2;
                break;
            case "contextual":
                index = 3;
                break;
            case "accion":
                index = 4;
                break;
        }
        return datos[index];
    }

}
