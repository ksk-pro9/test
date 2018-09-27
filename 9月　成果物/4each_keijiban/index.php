<!DOCTYPE html>
<html lang="ja">
    
<head>
<meta charset="UTF-8">
<title>4eachblog 掲示板</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
    
<body>
    <?php
    
mb_internal_encoding("utf8");
$pdo=new PDO("mysql:dbname=lesson_kanzaone;host=localhost;","root","mysql");
$stmt=$pdo->query("select * from 4each_keijiban");
   

?>

    


    
    
<div class="logo">
            <img src="4eachblog_logo.jpg">
        </div>
        
        
        <header>
            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせについて</li>
            </ul>
        </header>
        
        
        <div class="main_one">
            
            <h2 class="midasi">プログラミングに役立つ書類</h2>
            
            
            <!--
            <img class="tennai" src ="bookstore.jpg">
            -->
<div class="inputform">
                <h3>入力フォーム</h3>
<form method="post" action="insert.php">
    <div>
        <label>ハンドルネーム</label>
        <br>
        <input type="text" class="text" size="35" name="handlename">
    </div>
    
    <div>
        <label>タイトル</label>
        <br>
        <input type="text" class="text" size="35" name="title">
    </div>
    
    
    <div>
        <label>コメント</label>
        <br>
        <textarea cols="35" rows="7" name="comments">
        </textarea>
    </div>
        <div>
            <input type="submit" class="submit" value="送信する">
        </div>
    </form>
    </div>

<?php
        while($row=$stmt->fetch()){
            
echo "<div class='keijiban'>";
    
echo    "<h3>".$row['title']."</h3>";
echo    "<p>";
echo $row['comments'];
echo "<div class='handlename'>postedby".$row['handlename']."</div>";
echo    "</p>";
    echo "</div>";
        }
            
                      
           

?>
   </div>         
        
        <div class="main_two">
            <h3>人気の記事</h3>
            <ul>
                <li>PHP オススメ本</li>
                <li>PHP MyAdminの使い方</li>
                <li>今人気のエディタ　top5</li>
                <li>HTMLの基礎</li>
            </ul>   
                <br>
            <h3>オススメリンク</h3>
            <ul>
                <li>インターノウス株式会社</li>
                <li>XAMPPのダウンロード</li>
                <li>Eclipseのダウンロード</li>
                <li>Brancketsのダウンロード</li>
            </ul>    
                <br>
            <h3>カテゴリ</h3>
            <ul>
                <li>HTML</li>
                <li>PHP</li>
                <li>MySQL</li>
                <li>JavaScript</li>
            </ul>        
                <br>    
        </div>
        
        
        
        
        
        
        
        
            
    </body>
    <footer>
        copylight◎　internous | 4each blog is the one which provides A to Z about programming.
    </footer>
    </html>