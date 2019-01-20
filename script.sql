-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 09, 2018 at 09:18 PM
-- Server version: 5.7.21
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `examen2016`
--

-- --------------------------------------------------------

--
-- Table structure for table `Film`
--

CREATE TABLE `Film` (
  `idFilm` int(11) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `langue` varchar(50) NOT NULL,
  `duree` varchar(50) NOT NULL,
  `acteur` varchar(50) NOT NULL,
  `realisateur` varchar(50) NOT NULL,
  `seance` varchar(50) NOT NULL,
  `age` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Film`
--

INSERT INTO `Film` (`idFilm`, `titre`, `langue`, `duree`, `acteur`, `realisateur`, `seance`, `age`) VALUES
(1, 'Mowgli', 'Francais', '1h30', 'Franck Dubosc', 'J.K. Rowling', '18h', '12'),
(2, 'Harry Potter 7', 'Francais', '3h', 'James Potter', 'J.K. Rowling', '22h', '18'),
(3, 'Jack et les geants', 'Anglais', '1h30', 'Steve Jobs', 'Marion', '11h', '12'),
(4, 'Fast and Furious 9', 'Japonais', '2h', 'Hulk', 'Batman', '22h', '12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Film`
--
ALTER TABLE `Film`
  ADD PRIMARY KEY (`idFilm`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Film`
--
ALTER TABLE `Film`
  MODIFY `idFilm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
