<! doctype HTML>
<html lang="ja">

    <head>
        <meta charset="utf-8">
        <title>お問い合わせフォームを作る</title>
        <link rel="stylesheet" type="text/css" href="confilm.css">
    </head>

    <body>
        <h1>お問い合わせ内容画面</h1>
        
        <div class="confirm">
            <p>お問い合わせ内容はこちらで宜しいでしょうか？
                <br>よろしければ｢送信する｣ボタンを押して下さい。
            </p>
            <p>名前
                <br>
                <?php echo $_POST['name']; ?>
            </p>
            
            <p>メールアドレス
            <br>
            <?php echo $_POST['mail'];?>
            </p>
            
            <p>年齢
            <br>
            <?php echo $_POST['dropd'];?>
            </p>
            
            <p>コメント
            <br>
            <?php echo $_POST['comments'];?>
            </p>

            <form acrtion="kcontact.html">
                <input type="submit" class="button1" value="戻って修正する"/>
            </form>
            
            <form action="insert.php" method="post">
                <input type="submit" class="button2" value="登録する"/>
                <input type="hidden" value="<?php echo $['name']?>"name="name">
                <input type="hidden" value="<?php echo $['mail']?>"name="mail">
                <input type="hidden" value="<?php echo $['dropd']?>"name="dropd">
                <input type="hidden" value="<?php echo $['comments']?>"name="comments">
            
            
            
    </body>