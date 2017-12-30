create table BBS_REPLY
(
  id      NUMBER(10) not null,
  name    VARCHAR2(80),
  title   VARCHAR2(255),
  content VARCHAR2(255)
);
insert into BBS_REPLY (id, name, title, content)
values (1, '王小二', '谁知道呢', '在等等看吧');
insert into BBS_REPLY (id, name, title, content)
values (2, '小六', '我也在观望', '在等');
insert into BBS_REPLY (id, name, title, content)
values (3, '爱飞的云', '我也想知道', '希望早点出来');
insert into BBS_REPLY (id, name, title, content)
values (4, '蛋炒饭', '快了吧', '到了我就买');
insert into BBS_REPLY (id, name, title, content)
values (5, '飞起来', '听说10月份', '快点出吧');
insert into BBS_REPLY (id, name, title, content)
values (6, '蓝莲花', '大概9月', '9月份出来');
insert into BBS_REPLY (id, name, title, content)
values (7, '雨晴', '厉害了，要出来咯', '我就想马上买');
insert into BBS_REPLY (id, name, title, content)
values (8, '心雨', '等得好急啊', '快点发布吧');
insert into BBS_REPLY (id, name, title, content)
values (9, '不开心', '快快快', '我要买');
insert into BBS_REPLY (id, name, title, content)
values (10, '那就这样吧', '买买买', '现在唯一一件事就是等咯');
insert into BBS_REPLY (id, name, title, content)
values (11, '天高云淡', 'iPhone8快发布', '捉急等');
insert into BBS_REPLY (id, name, title, content)
values (12, '爱自己', '好想马上有一个', '好想马上有一个');
insert into BBS_REPLY (id, name, title, content)
values (13, '小飞', '到了就买', '到了就买');
insert into BBS_REPLY (id, name, title, content)
values (14, '王五', '等不及啦', '我好想要一个啊');
insert into BBS_REPLY (id, name, title, content)
values (15, '路人甲', '买起来', '赶紧买起来');
insert into BBS_REPLY (id, name, title, content)
values (16, '灰机', '嗨起来', '嗨起来');
commit;
