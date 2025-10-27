package jogo;

import models.personagem.Personagem;

import static jogo.Jogo.printWithDelay;

public class Historia {
    public static void printIntroducao() {
        printWithDelay("Neon Heist. Ano: 2197. Nightgird - uma cidade onde o céu é feito de fumaça e o ch±ao de corpos esquecidos. As megacorporações controlam tudo: governo, informação e até o ar que as pessoas respiram.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Os ricos vivem acima das nuvens. O resto... luta para não morrer de fome no nível da rua. Você nasceu nesse resto",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Sua mãe era socorrista, uma das poucas que ainda acreditavam em salvar vidas. Corria de ambulância pelos becos e zonas de guerra, tentando remendar o que sobrava da humanidade. Mas a verdade é que salvar pessoas não paga as contas.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Então, quando ninguém olhava, ela fazia o que precisava: roubava implantes, próteses e chips de valor dos corpos dos mortos. Contrabando sujo, mas necessário pra manter você vivo.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Uma noite, ela chegou em casa exausta, com sangue nos braços e o olhar distante. Jogou a bolsa num canto e disse apenas: “Hoje... encontrei algo que pode mudar nossas vidas.” Você não perguntou o que era. ",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("No dia seguinte, a chamada de emergência veio: incidente com tiroteio em área corporativa. Ela atendeu como sempre. Só que dessa vez... não voltou. ",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O relatório dizia: fogo cruzado entre gangues e segurança privada. A ambulância foi atingida. Nenhum sobrevivente. Quando você foi buscar os pertences dela, a dor era mais pesada que o silêncio.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("No meio da bolsa, encontrou um objeto escondido no fundo falso — um equipamento raro, proibido... e perigoso. Talvez fosse o mesmo que ela quis vender.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Talvez tenha sido por causa dele que morreu. Agora, é tudo o que resta dela. E tudo o que pode te dar uma chance de sobreviver.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Escolha o legado deixado por sua mãe. Cada item parece pulsar com energia — como se te escolhesse de volta.",35);
    }

    public static void printClasses() {
        System.out.println("---------------------------------------------------------------");
        printWithDelay("Espada Desassembler\n\n" +
                "Lâmina gravitônica capaz de distorcer o espaço em volta do alvo.\n" +
                "Cortes tão limpos que os sensores nervosos nem têm tempo de reagir.\n" +
                "Pulso de Colapso (50% chance de puxar e esquartejar inimigos)\n\n" +
                "Classe: BladeRunner(Guerreiro)\n" +
                "HP: 75\n" +
                "Ataque: 30\n" +
                "Defesa: 30\n" +
                "Inventário:\n" +
                "-Espada Desassembler\n" +
                "-3x Nanogel (cura)\n"
        ,10);
        System.out.println("---------------------------------------------------------------");
        printWithDelay("Cajado Trojan\n\n" +
                "Bastão neural forjado com circuitos vivos.\n" +
                "Sintoniza-se à Rede e emite pulsos mentais que sobrecarregam sinapses e chips.\n" +
                "Sobrecarga Neural (50% chance de paralizar o inimigo ao atacar)\n\n" +
                "Classe: Cybermancer (Mago)\n" +
                "HP: 50\n" +
                "Ataque: 40\n" +
                "Defesa: 20\n" +
                "Inventário:\n" +
                "-Cajado Trojan\n" +
                "-3x Nanogel (cura)\n"
        ,10);
        System.out.println("---------------------------------------------------------------");
        printWithDelay("Escudo Firewall\n\n" +
                "Blindagem tática alimentada por um reator térmico pulsante.\n" +
                "Cada impacto acende o campo protetor, devolvendo parte do dano ao inimigo.\n" +
                "Reflexão Prismática (50% chance de refletir metado do dano do ataque ao inimigo)\n\n" +
                "Classe: Panzer(Tanque)\n" +
                "HP: 100\n" +
                "Ataque: 20\n" +
                "Defesa: 50\n" +
                "Inventário:\n" +
                "-Escudo Firewall\n" +
                "-3x Nanogel (cura)\n"
        ,10);
        System.out.println("---------------------------------------------------------------");
    }

    public static void printAto1() {
        printWithDelay("Depois de encontrar o item deixado por sua mãe, você o segura com firmeza.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A realidade bate: ninguém mais vai cuidar de você.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("As ruas não esperam. A fome não espera. E as contas não perdoam.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você sai para dar uma volta, pensar em tudo o que aconteceu no dia anterior.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Enquanto observa o neón tremeluzindo nas poças de chuva, o som agudo do comunicador corta o silêncio do beco.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A tela azulada pisca no escuro, projetando uma notificação holográfica:",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Mensagem recebida — Remetente: Falco”. ",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Falco (voz cansada, mas firme):",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Ei, garoto... ouvi sobre sua mãe. Lamento mesmo. Ela era boa.“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Se liga , tenho um trampo rápido. Nada limpo, mas paga bem.“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Um carregamento da Monolith foi desviado e ficou encalhado num dos armazéns deles.“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Coisa pesada — e valiosa. Preciso de alguém com coragem e... sem nada a perder. Tá dentro?”",35);
        Jogo.pressAnythingToContinue();
    }

    public static void rejeitou() {
        Jogo.printWithDelay("Você recusa a proposta e desliga o comunicador.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("Ao voltar para seu apartamento, você olha pro item da sua mãe, ainda brilhando.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("Você sente o peso da decisão — às vezes, sobreviver também é perder oportunidades.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("Dias depois, o brilho do item já não parece o mesmo.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("A necessidade fala mais alto. Você o vende, sem olhar duas vezes.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("Com o dinheiro, paga as dívidas. Aluga um lugar pequeno, longe do centro.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("A vida segue... sem glória, sem riscos, mas em paz.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("NightGrid continua pulsando lá fora, mas você aprendeu a viver com o silêncio.", 35);
        Jogo.pressAnythingToContinue();
        Jogo.printWithDelay("FIM — Às vezes, o verdadeiro final feliz é apenas continuar existindo.", 35);
        Jogo.pressAnythingToContinue();
    }

    public static void aceitou(){
        printWithDelay("Um pouco hesitante, você aceita o trampo.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você respira fundo, volta para o apartamento e olha pro item da sua mãe.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ele pulsa como se respondesse ao chamado.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Dinheiro, propósito... ou talvez desespero, afinal, você não tem mais nada a perder.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Falco envia as coordenadas: Setor 12 — Zona industrial Monolith.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Vai com cuidado mano. A segurança da Monolith tá varrendo a área.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A transmissão se encerra, deixando só o zumbido elétrico do comunicador.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void beco1(){
        printWithDelay("Você decide não ir direto ao armazém.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Se tem carga valiosa envolvida, alguém nos becos deve saber de algo.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("As luzes de propaganda refletem nas poças do chão.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você vê um marginal perto de um barril queimando.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ele te reconhece: “Aí mano, ouvi que tua mãe não deu sorte... tá atrás de grana né?”",35);
        Jogo.pressAnythingToContinue();
    }

    public static void falaBeco1(){
        printWithDelay("Ele levanta a cabeça lentamente, já sacando a faca térmica que escondia no bolso e partindo pra cima de você",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Como é que é moleque? Perdeu a noção?“",35);
        Jogo.pressAnythingToContinue();
    }

    public static void falaBeco2(){
        printWithDelay("“Fiquei sabendo dessa fita aí sim, doideira, os Chrome Skulls estão doidos atrás disso.“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você ganha uma nova pista: Um grupo criminoso pode aparecer no local",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Fica esperto moleque... Os caras não estão de brincadeira“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você agradece pela informação e se vira para ir embora, mas o marginal grita seu nome",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Aí mano, leva isso aqui, se cuida.“",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você recebe um módulo de camuflagem de uso único. Pode ser útil caso você se meta numa enrrascada",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printPreArmazem(){
        printWithDelay("Você segue para o endereço enviado por Falco:o armazém Monolith, cercado por drones e luzes vermelhas piscando.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A chuva aperta. A cada relâmpago, os letreiros da Monolith piscam, projetando a sombra dos drones sobre os prédios.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Falco te avisou que seria arriscado — mas o desespero fala mais alto.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Quando se aproxima do portão de carga, uma voz robótica ecoa do painel digital:",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Identificação necessária.“",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printOpt1Start(){
        printWithDelay("Você conecta o item da sua mãe ao painel.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Linhas de código se espalham como veias de luz azul.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Teste de dado - Tentativa de hack.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printSucessoHack(){
        printWithDelay("O painel do portão faz um bipe, “Acesso autorizado“ ",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O portão abre silenciosamente. Você consegue entrar na Zona Industrial Monolith.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você anda cautelosamente até o portão de entrada do armazém, porém, percebe que ele está trancado e você não tem nenhum cartão de acesso.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Suas opções são procurar outra entrada ou tentar hackear o painel desse portão também“ ",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printSucessoHack2(){
        printWithDelay("O painel do portão faz um bipe, “Acesso autorizado“ ",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O portão abre silenciosamente. Você consegue entrar no armazém da Monolith.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O portão se fecha atrás de você com um estalo metálico.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printOpt1End(){
        printWithDelay("Após derrotar o guarda, você avança cautelosamente, sem encontrar mais nenhum guarda",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ao chegar no portão principal do armazém, você usa o cartão de acesso que pegou do guarda mais cedo",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printFalhaHack(){
        printWithDelay("O painel do portão explode e faz muito barulho.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você sente o coração acelerar.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Das sombras de um container próximo, surgem dois olhos vermelhos de um Guarda Cibernético.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printHack2(){
        printWithDelay("O painel do portão explode e faz muito barulho.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Hoje não é seu dia de sorte mesmo...",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você ouve o som de passos pesados atrás de você, é um Guarda Cibernético.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printOpt2Start(){
        printWithDelay("Você chuta o portão com tudo.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O barulho ecoa pelas paredes metálicas.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Sirenes disparam.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Aparição Inimiga: Guarda Cibernético",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printOpt2End(){
        printWithDelay("Você passa pela área externa do armazém sem encontrar mais guardas e chega ao portão principal do galpão.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Usa o cartão de acesso para abri-lo e entra rapidamente.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O portão se fecha atrás de você com um estalo metálico.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printOpt3Start(){
        printWithDelay("Você lembra do módulo de camuflagem que recebeu... e o ativa.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ao contornar o prédio, encontra um túnel de manutenção.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Está escuro. Úmido. O som dos seus passos ecoa nas paredes metálicas, seu módulo de camuflagem desativou.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Há marcas de sangue no chão... recentes.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A ideia de que deveria ter escolhido outra entrada começa a te perseguir.", 35);
        Jogo.pressAnythingToContinue();
        printWithDelay("No final do corredor, algo se move.", 35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Um grunhido metálico corta o silêncio — como se uma máquina estivesse agonizando.", 35);
        Jogo.pressAnythingToContinue();
        printWithDelay("É um guarda cibernético danificado... mas,para sua infelicidade ainda funcional, e ele está se arrastando na sua direção.", 35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Agora não tem jeito... é matar ou morrer.", 35);
        Jogo.pressAnythingToContinue();
    }
    public static void printOpt3End(){
        printWithDelay("Após o susto, você se recompõe",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A respiração ainda está acelerada, mas você está seguro, por enquanto.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A saída do túnel dá bem atrás do portão principal — você está dentro do armazém.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printAto2(){
        printWithDelay("Dentro do armazém, o ar é pesado, cheira a óleo queimado.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Luzes vermelhas piscam no teto — o sistema de segurança ainda está ativo.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Entre as pilhas de containers, o logo MONOLITH brilha em holograma, tremendo na névoa de fumaça.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você respira fundo. O som distante de drones de patrulha ecoa no corredor principal.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A carga que Falco mencionou deve estar aqui — e provavelmente não está desprotegida.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Enquanto avança entre caixas e cabos expostos, o comunicador chia de novo:",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Falco: “Boa. Você conseguiu entrar. O scanner de calor detecta algo grande no setor C-9.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("”Deve ser a carga. Mas cuidado, garoto — não é só segurança da Monolith que tá aí dentro.”",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A voz dele corta, seguida por estática",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Silêncio. Só o som do maquinário vibrando ao longe.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printCorredor1(){
        printWithDelay("Você decide seguir o caminho mais rápido — e mais arriscado.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("O chão metálico ecoa sob suas botas, e logo o zumbido das hélices dos drones responde de volta.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Três drones-sentinelas flutuam de trás das caixas, seus sensores ópticos brilhando em vermelho.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printCorredor2(){
        printWithDelay("Você encontra o container marcado com o selo da Monolith, trancado com senha.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você tem 6 tentativas para acertar o código de quatro números.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printPassarelas(){
        printWithDelay("Você escala as escadas de manutenção até as passarelas, de onde pode ver todo o armazém.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Os holofotes varrem o chão, mas aqui em cima é escuridão e silêncio.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você avança agachado, pisando com cuidado.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Teste de dado - furtividade.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printFalhaStealth(){

    }
    public static void printSucessoStealth(){
        printWithDelay("Você evita os drones e chega até o escritório de vigilância, onde encontra um membro da ChromeSkull.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ele ainda não te viu, mas você precisa lidar com ele.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printPEM(){
        printWithDelay("Você abre a porta e rapidamente lança o núcleo instável no inimigo com toda sua força.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Uma explosão de energia ocorre. O cérebro do inimigo frita, ele cai duro no chão.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Uma explosão de energia ocorre. O cérebro do inimigo frita, ele cai duro no chão.",35);
        Jogo.pressAnythingToContinue();
        printLutaEnd();
    }
    public static void printLuta(){
        printWithDelay("Você abre a porta e rapidamente e parte pra cima do inimigo.",35);
        Jogo.pressAnythingToContinue();
    }
    public static void printLutaEnd(){
        printWithDelay("Após derrotar o gangster, você olha os monitores das câmeras do armazém.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você localiza um container com TOP SECRET escrito do lado. Você achou a carga.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Agora que sabe exatamente onde ir, você avança com cuidado pelos caminhos estreitos do armazém em direção à carga.",35);
        Jogo.pressAnythingToContinue();
    }

    public static void printEscritorio(){
        printWithDelay("Um membro armado da gangue ChromeSkulls também invadiu.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Ele está vasculhando a área, procurando exatamente o mesmo container que você.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("Você ouve ele conversando no comunicador:",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("“Você viu aquele cara nas câmeras? Bem que o Falco falou que ia facilitar pra gente, mandou até uma distração hahaha”",35);
        Jogo.pressAnythingToContinue();
        printWithDelay("A revelação te atinge em cheio.",35);
        Jogo.pressAnythingToContinue();
        printWithDelay(" Falco pode ter te mandado pra morrer — uma simples distração.",35);
        Jogo.pressAnythingToContinue();
        //Escolhas:
        //Enfrentar a gangue (Combate direto — ChromeSkulls Lv 2, Loot: Nanogel, Chip de Acesso)
        //
        //
        //Evitar confronto e fugir com a carga (Teste de furtividade— dado)

    }

    public static void printMorte(){
        System.out.println("  ________                        ________                     \n" +
                " /  _____/_____    _____   ____   \\_____  \\___  __ ___________ \n" +
                "/   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\\n" +
                "\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/\n" +
                " \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   \n");
        Jogo.pressAnythingToContinue();

    }
}
