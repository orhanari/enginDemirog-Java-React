PGDMP     :                    y            hrms    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16563    hrms    DATABASE     a   CREATE DATABASE hrms WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE hrms;
                postgres    false            �            1259    16588    GenelIsPozisyonlari    TABLE     z   CREATE TABLE public."GenelIsPozisyonlari" (
    "Id" integer NOT NULL,
    "PozisyonAd" character varying(50) NOT NULL
);
 )   DROP TABLE public."GenelIsPozisyonlari";
       public         heap    postgres    false            �            1259    16586    GenelIsPozisyonlari_Id_seq    SEQUENCE     �   ALTER TABLE public."GenelIsPozisyonlari" ALTER COLUMN "Id" ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."GenelIsPozisyonlari_Id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    206            �            1259    16576    IsArayanKullanicilar    TABLE     �   CREATE TABLE public."IsArayanKullanicilar" (
    "Id" integer NOT NULL,
    "Ad" character varying(50) NOT NULL,
    "Soyad" character varying(50) NOT NULL,
    "TcKimlikNo" character(11) NOT NULL,
    "DogumYili" character varying(4) NOT NULL
);
 *   DROP TABLE public."IsArayanKullanicilar";
       public         heap    postgres    false            �            1259    16581    IsVerenKullanicilar    TABLE     �   CREATE TABLE public."IsVerenKullanicilar" (
    "Id" integer NOT NULL,
    "SirketAdi" character varying(50) NOT NULL,
    "SirketWebSitesi" character varying(50) NOT NULL,
    "Telefon" character(10) NOT NULL
);
 )   DROP TABLE public."IsVerenKullanicilar";
       public         heap    postgres    false            �            1259    16566    Kullanicilar    TABLE     �   CREATE TABLE public."Kullanicilar" (
    "Id" integer NOT NULL,
    "Eposta" character varying(50) NOT NULL,
    "Parola" character varying(50) NOT NULL
);
 "   DROP TABLE public."Kullanicilar";
       public         heap    postgres    false            �            1259    16564    Kullanicilar_Id_seq    SEQUENCE     �   ALTER TABLE public."Kullanicilar" ALTER COLUMN "Id" ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."Kullanicilar_Id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    201            �            1259    16571    SistemKullanicilar    TABLE     �   CREATE TABLE public."SistemKullanicilar" (
    "Id" integer NOT NULL,
    "Ad" character varying(50) NOT NULL,
    "Soyad" character varying(50) NOT NULL
);
 (   DROP TABLE public."SistemKullanicilar";
       public         heap    postgres    false            �          0    16588    GenelIsPozisyonlari 
   TABLE DATA           C   COPY public."GenelIsPozisyonlari" ("Id", "PozisyonAd") FROM stdin;
    public          postgres    false    206   �$       �          0    16576    IsArayanKullanicilar 
   TABLE DATA           `   COPY public."IsArayanKullanicilar" ("Id", "Ad", "Soyad", "TcKimlikNo", "DogumYili") FROM stdin;
    public          postgres    false    203   �$       �          0    16581    IsVerenKullanicilar 
   TABLE DATA           `   COPY public."IsVerenKullanicilar" ("Id", "SirketAdi", "SirketWebSitesi", "Telefon") FROM stdin;
    public          postgres    false    204   1%       �          0    16566    Kullanicilar 
   TABLE DATA           B   COPY public."Kullanicilar" ("Id", "Eposta", "Parola") FROM stdin;
    public          postgres    false    201   �%       �          0    16571    SistemKullanicilar 
   TABLE DATA           C   COPY public."SistemKullanicilar" ("Id", "Ad", "Soyad") FROM stdin;
    public          postgres    false    202   &       �           0    0    GenelIsPozisyonlari_Id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public."GenelIsPozisyonlari_Id_seq"', 6, true);
          public          postgres    false    205            �           0    0    Kullanicilar_Id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public."Kullanicilar_Id_seq"', 8, true);
          public          postgres    false    200            A           2606    16613 6   GenelIsPozisyonlari GenelIsPozisyonlari_PozisyonAd_key 
   CONSTRAINT     }   ALTER TABLE ONLY public."GenelIsPozisyonlari"
    ADD CONSTRAINT "GenelIsPozisyonlari_PozisyonAd_key" UNIQUE ("PozisyonAd");
 d   ALTER TABLE ONLY public."GenelIsPozisyonlari" DROP CONSTRAINT "GenelIsPozisyonlari_PozisyonAd_key";
       public            postgres    false    206            C           2606    16592 ,   GenelIsPozisyonlari GenelIsPozisyonlari_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public."GenelIsPozisyonlari"
    ADD CONSTRAINT "GenelIsPozisyonlari_pkey" PRIMARY KEY ("Id");
 Z   ALTER TABLE ONLY public."GenelIsPozisyonlari" DROP CONSTRAINT "GenelIsPozisyonlari_pkey";
       public            postgres    false    206            ;           2606    16609 8   IsArayanKullanicilar IsArayanKullanicilar_TcKimlikNo_key 
   CONSTRAINT        ALTER TABLE ONLY public."IsArayanKullanicilar"
    ADD CONSTRAINT "IsArayanKullanicilar_TcKimlikNo_key" UNIQUE ("TcKimlikNo");
 f   ALTER TABLE ONLY public."IsArayanKullanicilar" DROP CONSTRAINT "IsArayanKullanicilar_TcKimlikNo_key";
       public            postgres    false    203            =           2606    16580 .   IsArayanKullanicilar IsArayanKullanicilar_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public."IsArayanKullanicilar"
    ADD CONSTRAINT "IsArayanKullanicilar_pkey" PRIMARY KEY ("Id");
 \   ALTER TABLE ONLY public."IsArayanKullanicilar" DROP CONSTRAINT "IsArayanKullanicilar_pkey";
       public            postgres    false    203            ?           2606    16585 ,   IsVerenKullanicilar IsVerenKullanicilar_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public."IsVerenKullanicilar"
    ADD CONSTRAINT "IsVerenKullanicilar_pkey" PRIMARY KEY ("Id");
 Z   ALTER TABLE ONLY public."IsVerenKullanicilar" DROP CONSTRAINT "IsVerenKullanicilar_pkey";
       public            postgres    false    204            5           2606    16611 $   Kullanicilar Kullanicilar_Eposta_key 
   CONSTRAINT     g   ALTER TABLE ONLY public."Kullanicilar"
    ADD CONSTRAINT "Kullanicilar_Eposta_key" UNIQUE ("Eposta");
 R   ALTER TABLE ONLY public."Kullanicilar" DROP CONSTRAINT "Kullanicilar_Eposta_key";
       public            postgres    false    201            7           2606    16570    Kullanicilar Kullanicilar_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public."Kullanicilar"
    ADD CONSTRAINT "Kullanicilar_pkey" PRIMARY KEY ("Id");
 L   ALTER TABLE ONLY public."Kullanicilar" DROP CONSTRAINT "Kullanicilar_pkey";
       public            postgres    false    201            9           2606    16575 *   SistemKullanicilar SistemKullanicilar_pkey 
   CONSTRAINT     n   ALTER TABLE ONLY public."SistemKullanicilar"
    ADD CONSTRAINT "SistemKullanicilar_pkey" PRIMARY KEY ("Id");
 X   ALTER TABLE ONLY public."SistemKullanicilar" DROP CONSTRAINT "SistemKullanicilar_pkey";
       public            postgres    false    202            E           2606    16603 .   IsArayanKullanicilar IsArayanKullanicilar_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."IsArayanKullanicilar"
    ADD CONSTRAINT "IsArayanKullanicilar_fkey" FOREIGN KEY ("Id") REFERENCES public."Kullanicilar"("Id") NOT VALID;
 \   ALTER TABLE ONLY public."IsArayanKullanicilar" DROP CONSTRAINT "IsArayanKullanicilar_fkey";
       public          postgres    false    203    201    2871            F           2606    16598 ,   IsVerenKullanicilar IsVerenKullanicilar_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."IsVerenKullanicilar"
    ADD CONSTRAINT "IsVerenKullanicilar_fkey" FOREIGN KEY ("Id") REFERENCES public."Kullanicilar"("Id") NOT VALID;
 Z   ALTER TABLE ONLY public."IsVerenKullanicilar" DROP CONSTRAINT "IsVerenKullanicilar_fkey";
       public          postgres    false    2871    204    201            D           2606    16593 *   SistemKullanicilar SistemKullanicilar_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."SistemKullanicilar"
    ADD CONSTRAINT "SistemKullanicilar_fkey" FOREIGN KEY ("Id") REFERENCES public."Kullanicilar"("Id") NOT VALID;
 X   ALTER TABLE ONLY public."SistemKullanicilar" DROP CONSTRAINT "SistemKullanicilar_fkey";
       public          postgres    false    201    2871    202            �   Y   x�3�t+��+�u�KQpI-K��/H-�2�tJL�F4�t+��	.� ��p秕�'�*��� EL"�E��%��%\fA��=... �+"      �   0   x�3��/�H��t��4�452SNCKK.3,�fff�=... Ȳ;      �   ]   x�3���O�I�MT���̆0�2�9MMM������9�JR���9!�^^j	���	X��	�	�{~~zN*gznbf�^r~.���1L{� S      �   o   x�u�A
� ��F��j�A�%%5N��n_d����� 8,�18 mfB���ITu���m���`��!�r�r��`Hv���M/���v"1Y2yn�1Ƈ{AW:��ヒR���BJ      �   *   x�3��/�H��t�䲀�<R�"S�RR�\�1z\\\ �-
�     