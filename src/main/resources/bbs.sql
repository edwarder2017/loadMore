create table BBS_REPLY
(
  id      NUMBER(10) not null,
  name    VARCHAR2(80),
  title   VARCHAR2(255),
  content VARCHAR2(255)
);
insert into BBS_REPLY (id, name, title, content)
values (1, '��С��', '˭֪����', '�ڵȵȿ���');
insert into BBS_REPLY (id, name, title, content)
values (2, 'С��', '��Ҳ�ڹ���', '�ڵ�');
insert into BBS_REPLY (id, name, title, content)
values (3, '���ɵ���', '��Ҳ��֪��', 'ϣ��������');
insert into BBS_REPLY (id, name, title, content)
values (4, '������', '���˰�', '�����Ҿ���');
insert into BBS_REPLY (id, name, title, content)
values (5, '������', '��˵10�·�', '������');
insert into BBS_REPLY (id, name, title, content)
values (6, '������', '���9��', '9�·ݳ���');
insert into BBS_REPLY (id, name, title, content)
values (7, '����', '�����ˣ�Ҫ������', '�Ҿ���������');
insert into BBS_REPLY (id, name, title, content)
values (8, '����', '�ȵúü���', '��㷢����');
insert into BBS_REPLY (id, name, title, content)
values (9, '������', '����', '��Ҫ��');
insert into BBS_REPLY (id, name, title, content)
values (10, '�Ǿ�������', '������', '����Ψһһ���¾��ǵȿ�');
insert into BBS_REPLY (id, name, title, content)
values (11, '����Ƶ�', 'iPhone8�췢��', '׽����');
insert into BBS_REPLY (id, name, title, content)
values (12, '���Լ�', '����������һ��', '����������һ��');
insert into BBS_REPLY (id, name, title, content)
values (13, 'С��', '���˾���', '���˾���');
insert into BBS_REPLY (id, name, title, content)
values (14, '����', '�Ȳ�����', '�Һ���Ҫһ����');
insert into BBS_REPLY (id, name, title, content)
values (15, '·�˼�', '������', '�Ͻ�������');
insert into BBS_REPLY (id, name, title, content)
values (16, '�һ�', '������', '������');
commit;
