-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 16, 2022 at 06:44 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airline`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ticketId` int(50) NOT NULL,
  `flightId` int(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `passport` varchar(50) NOT NULL,
  `birthDate` varchar(50) NOT NULL,
  `noOfPax` varchar(50) NOT NULL,
  `totalPrice` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ticketId`, `flightId`, `firstName`, `lastName`, `passport`, `birthDate`, `noOfPax`, `totalPrice`) VALUES
(163, 1, 'erte', 'yui', '43563', '2022-01-22', '1', '4500'),
(424, 2, 'jefff', 'yery', '45645', '2022-01-08', '2', '24000');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flightId` int(50) NOT NULL,
  `flightName` varchar(50) NOT NULL,
  `fromOrigin` varchar(50) NOT NULL,
  `toDest` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `depTime` varchar(50) NOT NULL,
  `arrTime` varchar(50) NOT NULL,
  `charge` varchar(50) NOT NULL,
  `class` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flightId`, `flightName`, `fromOrigin`, `toDest`, `date`, `depTime`, `arrTime`, `charge`, `class`) VALUES
(1, 'malindo', 'kl', 'chine', '17-01-2022', '4.00am', '12.00pm', '4500', 'Economy'),
(2, 'airasia', 'kl', 'chine', '18-01-2022', '3.55pm', '4.00pm', '12000', 'First Class');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD KEY `cust_flight` (`flightId`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`flightId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `flight`
--
ALTER TABLE `flight`
  MODIFY `flightId` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `cust_flight` FOREIGN KEY (`flightId`) REFERENCES `flight` (`flightId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
