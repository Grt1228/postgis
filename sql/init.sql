-- auto-generated definition
create table t_store
(
    id          serial                   not null
        constraint t_store_pk
            primary key,
    name        varchar(64)              not null,
    longitude   varchar,
    latitude    varchar                  not null,
    geom        geometry(Point, 4326) not null,
    create_time timestamp default now()  not null,
    update_time timestamp default now()  not null
);

comment on column t_store.name is '名称';

comment on column t_store.longitude is '经度';

comment on column t_store.latitude is '纬度';

comment on column t_store.geom is '地理位置信息';

alter table t_store
    owner to postgres;
