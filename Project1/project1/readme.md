### 工具準備
<li id="a">安裝 GNU make：</li>

```bash
sudo apt-get install make
```

<li>下載 ANTLR：</li>
使用 ANTLR 版本 3.5.2：<a href = https://www.antlr3.org>ANTLR 3 官網</a> 下載，將 jar 檔案放在專案根目錄下。
<br/>
<br/>   <!-- 空行   -->
<li>安裝OpenJDK</li>

```bash
sudo -s
apt-get install openjdk-11-jdk
```

### 編譯
提供`makefile`進行編譯，使用`makefile`前，確保已<a href="#a">安裝 GNU make</a>
，進入專案目錄並輸入以下指令：
```bash
make
```

### 清理環境
清理建置過程中所生成的檔案
```bash
make clean
```

### 執行
```bash
java -cp antlr-3.5.2-complete-no-st3.jar:. testLexer sample1.c
```


<!-- 進入解壓縮後的資料夾內：
如何編譯：執行make指令。
如何執行：執行"java -cp antlr-3.5.2-complete-no-st3.jar:. testLexer sample.c "指令。 -->