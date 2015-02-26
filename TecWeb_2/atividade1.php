<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            $P1 = 3;
            $M1 = 1;
            $M2 = 1;
            $Proj1 = 0.5;
            $Proj2 = 0.5;
            $Proj3 = 0.5;
            $Proj4 = 0.5;
            $TrabF = 1;
            $Proc = 2;
            $PF = 10;
            
            $MI = (30*$P1 + 10*$M1 + 10*$M2 + 0.5*$Proj1 + 0.5*$Proj3 + 
            0.5*$Proj4 + 10*$TrabF + 20*$Proc)/100;
            
            if($M1 >= 7.5){
                $MF = $MI;
                echo 'Aprovado sem Prova Final';
                echo 'Parabéns!!! Boas férias';
            }else{
                $MF = ($MI + $PF)/2;
                if($MF>=6.0){
                    echo 'Aprovado com Prova Final';
                    echo 'Agora já pode descansar tranquilo.';
                }else{
                    echo 'Reprovado';
                    echo 'Não foi dessa vez. Ano que vem tem mais TWII.';
                }
            }
            echo "Média Intermediária: $MI";
            echo "Média Final: $MF";
           
        ?>
    </body>
</html>
