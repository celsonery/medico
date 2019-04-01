-- Creator:       MySQL Workbench 6.1.6/ExportSQLite plugin 2009.12.02
-- Author:        Celso Nery
-- Caption:       New Model
-- Project:       Name of the project
-- Changed:       2015-06-09 14:45
-- Created:       2015-04-16 17:28
PRAGMA foreign_keys = OFF;

-- Schema: Medico
BEGIN;
CREATE TABLE "pacientes"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "mat" INTEGER,
  "nome" VARCHAR(45),
  "cpf" CHAR(11),
  "rg" VARCHAR(45),
  "declara" CHAR(2),
  "sexo" VARCHAR(10),
  "nasc" VARCHAR(10),
  "end" VARCHAR(255),
  "num" INTEGER,
  "comp" VARCHAR(255),
  "bairro" VARCHAR(45),
  "cidade" VARCHAR(45),
  "uf" CHAR(2),
  "cep" INTEGER,
  "telres" VARCHAR(45),
  "telcom" VARCHAR(45),
  "op1" VARCHAR(45),
  "telcel" VARCHAR(45),
  "op2" VARCHAR(45),
  "telfax" VARCHAR(45),
  "teloutro" VARCHAR(45),
  "email" VARCHAR(45),
  "obs" TEXT,
  "alerta" TEXT,
  "dtcadastro" VARCHAR(10),
  "dtupdate" VARCHAR(10),
  "ct" TEXT,
  "cp" TEXT,
  "lf" TEXT,
  "cs" TEXT,
  "pa" TEXT,
  "usg" TEXT,
  "rx" TEXT,
  "mgf" TEXT,
  "do" TEXT,
  "outrotxt" LONGTEXT
);
CREATE TABLE "especialidades"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "nome" VARCHAR(45)
);
CREATE TABLE "Modelos"(
  "id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "nome" VARCHAR(255),
  "text" LONGTEXT,
  "tipo" VARCHAR(45),
  "end" VARCHAR(255),
  "tels" VARCHAR(255),
  "data" VARCHAR(45)
);
CREATE TABLE "atestado_especial"(
  "id" INTEGER PRIMARY KEY NOT NULL,
  "paciente" VARCHAR(255),
  "end" VARCHAR(255),
  "prescricao" TEXT,
  "tels" VARCHAR(255),
  "data" VARCHAR(10)
);
CREATE TABLE "tblTableExame"(
  "texID" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "texNome" VARCHAR(255),
  "texCol1" VARCHAR(45),
  "texCol2" VARCHAR(45),
  "texAtivo" CHAR(1)
);
CREATE TABLE "tblExame"(
  "exID" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  "exNome" VARCHAR(45),
  "exCol1" NUMERIC(10,2),
  "exCol2" NUMERIC(10,2),
  "exPreco" NUMERIC(10,2),
  "tblTableExame_texID" INTEGER NOT NULL,
  CONSTRAINT "fk_tblExame_tblTableExame1"
    FOREIGN KEY("tblTableExame_texID")
    REFERENCES "tblTableExame"("texID")
);
CREATE INDEX "tblExame.fk_tblExame_tblTableExame1_idx" ON "tblExame"("tblTableExame_texID");
COMMIT;
