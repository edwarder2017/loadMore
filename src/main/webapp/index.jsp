<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link type="text/css" rel="stylesheet" href="css/forum.css">
	</head>
	<body>
		<article>
            <!-- 帖子的头部信息 -->
            <header>
                <h1>iPhone8到底什么时候出呀?</h1>
                <div>楼主: 翠花</div>
            </header>
            <p>
            iPhone8大约什么时候上市呀，有没有大神能给个预测时间
            </p>
            <section id="reply">
                <!-- 每个article代表一个回复 -->
                <article>
                    <header>
                        <h2>大概在今年9月份</h2>
                        <div>2楼: 赵二</div>
                    </header>
                    <p>
                    iPhone一般都在9月到10月发布新品，要买可以关注下
                    </p>
                </article>
                <!-- 每个article代表一个回复 -->
                <article>
                    <header>
                        <h2>厉害了，我的哥</h2>
                        <div>3楼: 张三</div>
                    </header>
                    <p>自古二楼出真相</p>
                </article>
            </section>
            <footer>
                	<a id="tips" href="#" onclick="loadMore()">点击加载更多</a>
            </footer>
         </article>  
	</body>
	<script type="text/javascript">
		var page = 1;
		function getXHR() {
			// 该方法用于获取Ajax通信对象
			var xhr = null;
			if (window.XMLHttpRequest != null &&
					window.XMLHttpRequest != undefined) {
				xhr = new XMLHttpRequest();
			} else {
				// 兼容早期的IE浏览器
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
			return xhr;
		}
		function loadMore(){
			var xhr = getXHR();
			xhr.open("get", "/loadMore/ReplyController?page=" + page);
			xhr.send();
			xhr.onreadystatechange = function(){
				if (xhr.readyState == 4 && xhr.status == 200) {
					//获取下一页的页码
					if(xhr.responseText[0] == '0'){
						document.getElementById("tips").innerHTML = "到底啦";
						document.getElementById("tips").onclick = "";
					}
					//下一页的页码
					page = xhr.responseText[0];
					var replies = JSON.parse(xhr.responseText.substring(1));
					var replyTag = document.getElementById("reply");
					for (var i = 0; i < replies.length; i++) {
						var _article = document.createElement("article");
						var _header = document.createElement("header");
						var _h = document.createElement("h2");
						var _div = document.createElement("div");
						var _p = document.createElement("p");
						
						_h.innerHTML = replies[i].title;
						_div.innerHTML = replies[i].name;
						_p.innerHTML = replies[i].content;
						
						_header.appendChild(_h);
						_header.appendChild(_div);
						_article.appendChild(_header);
						_article.appendChild(_p);
						
						replyTag.appendChild(_article);
					}
				}
			}
		}
	</script>
</html>